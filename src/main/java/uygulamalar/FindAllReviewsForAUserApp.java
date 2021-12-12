package uygulamalar;

import dto.UserReviewDTO;
import entityService.KullaniciEntityService;

import java.util.List;

public class FindAllReviewsForAUserApp {
    public static void main(String[] args) {
        KullaniciEntityService service = new KullaniciEntityService();
        List<UserReviewDTO> userReviewList = service.findReviewsForASpesificUser();

        for(UserReviewDTO urunYorum: userReviewList) {
            System.out.println(urunYorum);
        }
    }
}