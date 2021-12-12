import dto.UrunYorumCountDTO;
import entityService.KullaniciEntityService;
import entityService.UrunYorumEntityService;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        UrunYorumEntityService urunYorumEntityService = new UrunYorumEntityService();
        urunYorumEntityService.findAllReviewsForProduct();
        List<UrunYorumCountDTO> productReviewList = urunYorumEntityService.findProductReviewCount();

        for (UrunYorumCountDTO product : productReviewList) {
            System.out.println(product.getUrunAdi());
        }

        KullaniciEntityService kullaniciEntityService = new KullaniciEntityService();
        kullaniciEntityService.findReviewsForASpesificUser();
    }
}
