package uygulamalar;

import dto.UrunYorumCountDTO;
import entityService.UrunYorumEntityService;

import java.util.List;

public class FindAllProductReviewsCountApp {
    public static void main(String[] args) {
        UrunYorumEntityService service = new UrunYorumEntityService();
        List<UrunYorumCountDTO> urunYorumCountList = service.findProductReviewCount();

        for(UrunYorumCountDTO urunYorum: urunYorumCountList) {
            System.out.println(urunYorum);
        }
    }

}
