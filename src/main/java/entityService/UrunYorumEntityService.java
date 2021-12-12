package entityService;

import dao.UrunYorumDao;
import dto.UrunYorumCountDTO;
import dto.UrunYorumDetayDTO;

import java.util.List;

public class UrunYorumEntityService {
    private UrunYorumDao urunYorumDao;

    public UrunYorumEntityService() {
        urunYorumDao = new UrunYorumDao();
    }

    public List<UrunYorumDetayDTO> findAllReviewsForProduct(){
        return urunYorumDao.findAllReviewsOfProduct();
    }

    public List<UrunYorumCountDTO> findProductReviewCount(){
        return urunYorumDao.findProductReviewCount();
    }


}
