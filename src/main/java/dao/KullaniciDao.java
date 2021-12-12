package dao;

import base.BaseDao;
import dto.UserReviewDTO;
import org.hibernate.query.Query;

import java.util.List;

public class KullaniciDao extends BaseDao {
    public List<UserReviewDTO> findAllReviewsForASpesificUser() {
        String sql = " select " +
                " new dto.UserReviewDTO( urunyorum.kullanici_id.id, urunyorum.kullanici_id.adi, urunyorum.urun_id.adi, urunyorum.yorum, urunyorum.yorum_tarihi) " +
                " from Kullanici kullanici " +
                " inner join UrunYorum urunyorum  on kullanici.id = urunyorum.kullanici_id.id" +
                " inner join Urun urun  on urun.id = urunyorum.urun_id.id " +
                " order by kullanici.id asc";


        Query query = getCurrentSession().createQuery(sql);
        return query.list();
    }
}
