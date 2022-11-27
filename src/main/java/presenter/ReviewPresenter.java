package presenter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import use_cases.review_use_case.ReviewOutputBoundary;
import use_cases.review_use_case.ReviewResponseModel;

public class ReviewPresenter implements ReviewOutputBoundary{
    /**
     * this method reports the status pf a review after an action (add,delete,hide) is performed on this
     * review，along with the time the action is performed.
     *
     * @param responseModel a ReviewResponseModel containing the content, status and action time of a review
     *                      when the review is added. When a review is deleted or hided, the response model will
     *                      only have the status and action time of the review.
     * @return ReviewResponseModel
     */
    @Override
    public ReviewResponseModel reportReview(ReviewResponseModel responseModel) {
        LocalDateTime responseTime = LocalDateTime.parse(responseModel.getCreationTime());
        responseModel.setCreationTime(responseTime.format(DateTimeFormatter.ofPattern("hh:mm:ss")));
        return responseModel;
    }

}
