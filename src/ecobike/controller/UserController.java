package ecobike.controller;

import ecobike.model.Bike;
import ecobike.model.Session;
import ecobike.model.User;
import ecobike.service.BikeService;
import ecobike.service.SessionService;
import ecobike.service.UserService;
import ecobike.view.UserView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class UserController {
    private final SessionService sessionService;
    private final BikeService bikeService;
    private final UserService userService;
    private final UserView userView;
    private final User user;

    public UserController(SessionService sessionService, BikeService bikeService, UserService userService, UserView userView, User user) {
        this.sessionService = sessionService;
        this.bikeService = bikeService;
        this.userService = userService;
        this.userView = userView;
        this.user = user;

        // Tell the View that when ever the calculate button
        // is clicked to execute the actionPerformed method
        // in the CalculateListener inner class

        this.userView.addChooseBikeListener(new ChooseBikeListener());
        this.userView.addExitConfirmListener(new ExitConfirmListener());
        this.userView.addConfirmListener(new ConfirmListener());
        this.userView.addShowRentalDetailsListener(new ShowRentalDetailsListener());
    }

    class ChooseBikeListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            try {
                userView.pressChooseBike();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }
    class ExitConfirmListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            try {
                userView.pressExitConfirm();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }
    class ConfirmListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            try {
                Bike bike_example = new Bike();
                Session new_session = new Session(user.getId(), bike_example.getBikeId());
                sessionService.insert(new_session);
                userView.pressConfirm();
            } catch (Exception ex) {
                ex.printStackTrace();
            }

        }
    }
    class ShowRentalDetailsListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            try {
                short userId = user.getId();
                User new_user = userService.findById(userId);
                double balance = new_user.getBalance();

                Session new_session = sessionService.findByUserId(userId);

                Bike new_bike = bikeService.findById(new_session.getBikeId());

                double currentFee = userService.calculateCurentFee(new_bike, new_session);

                LocalDateTime timeSpent = userService.calculateTimeSpent(new_session);

                userView.showRentalDetails(balance, new_bike, currentFee, timeSpent);
            } catch (SQLException ex) {
                ex.printStackTrace();
            }

        }
    }
}
