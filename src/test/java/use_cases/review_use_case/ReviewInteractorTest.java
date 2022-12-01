package use_cases.review_use_case;

import org.junit.jupiter.api.Test;
import screens.review_screen.IReviewView;
import screens.review_screen.InMemoryReview;
import screens.review_screen.ReviewTestScreen;
import use_cases.regular_user_register_use_case.UserGateway;

import javax.management.InvalidAttributeValueException;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class ReviewInteractorTest {

    @Test
    void addReview() throws IOException, InvalidAttributeValueException {
        ReviewGateway reviewRepository = new InMemoryReview();
        IReviewView iView =  new ReviewTestScreen();

        ReviewOutputBoundary presenter = new ReviewPresenter(iView) {
            @Override
            public ReviewResponseModel reportReview(ReviewResponseModel review) {
                assertEquals("added", review.getStatus());
                assertNotNull(review.getCreationTime());
                return null;
            }
        };

        UserGateway userGateway = new UserGateway(System.getProperty("user.dir"));
        ReviewInputBoundary interactor = new ReviewInteractor(
                presenter, reviewRepository, userGateway);

        ReviewRequestModel inputData = new ReviewRequestModel(
                1, "good guy", "Alice", "Bob");

        interactor.addReview(inputData);

    }

    @Test
    void deleteReview() throws IOException, InvalidAttributeValueException {
        ReviewGateway reviewRepository = new InMemoryReview();
        IReviewView iView =  new ReviewTestScreen();
        ReviewOutputBoundary presenter = new ReviewPresenter(iView) {
            @Override
            public ReviewResponseModel reportReview(ReviewResponseModel review) {
                assertEquals("deleted", review.getStatus());
                assertNotNull(review.getCreationTime());
                return null;
            }
        };
        UserGateway userGateway = new UserGateway(System.getProperty("user.dir"));
        ReviewInputBoundary interactor = new ReviewInteractor(
                presenter, reviewRepository, userGateway);

        ReviewRequestModel inputData = new ReviewRequestModel(
                1, "good guy", "Alice", "Bob");

        interactor.addReview(inputData);
        interactor.deleteReview(1);
    }
}

//    @Test
//    void hideReview() throws IOException, InvalidAttributeValueException {
//        ReviewGateway reviewRepository = new InMemoryReview();
//        IReviewView iView =  new ReviewTestScreen();
//        // This creates an anonymous implementing class for the Output Boundary.
//        ReviewOutputBoundary presenter = new ReviewPresenter(iView) {
//            @Override
//            public ReviewResponseModel reportReview(ReviewResponseModel review) {
//                // 4) Check that the Output Data and associated changes
//                // are correct
//                assertEquals("hided", review.getStatus());
//                assertNotNull(review.getCreationTime()); // any creation time is fine.
//                return null;
//            }
//        };
//        UserGateway userGateway = new UserGateway(System.getProperty("user.dir"));
//        ReviewInputBoundary interactor = new ReviewInteractor(
//                presenter, reviewRepository, userGateway);
//
//        // 2) Input data — we can make this up for the test. Normally it would
//        // be created by the Controller.
//        ReviewRequestModel inputData = new ReviewRequestModel(
//                1, "good guy", "Alice", "Bob");
//
//        // 3) Run the use case
//        interactor.addReview(inputData);
//        interactor.hideReview(1);
//
//    }
