package uygulamalar;

import dto.UrunYorumDetayDTO;
import entityService.UrunYorumEntityService;

import java.util.List;

public class FindProductReviewsApp {
    public static void main(String[] args) {
        UrunYorumEntityService service = new UrunYorumEntityService();
        List<UrunYorumDetayDTO> urunYorumList = service.findAllReviewsForProduct();

        for(UrunYorumDetayDTO urunYorum: urunYorumList) {
            System.out.println(urunYorum);
        }
    }
}
