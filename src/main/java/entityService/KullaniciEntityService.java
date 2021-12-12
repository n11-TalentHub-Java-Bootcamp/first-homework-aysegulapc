package entityService;

import dao.KullaniciDao;
import dto.UserReviewDTO;

import java.util.List;

public class KullaniciEntityService {

    private KullaniciDao kullaniciDao;

    public KullaniciEntityService() {
        kullaniciDao = new KullaniciDao();
    }

    public List<UserReviewDTO> findReviewsForASpesificUser() {
        return kullaniciDao.findAllReviewsForASpesificUser();
    }
}
