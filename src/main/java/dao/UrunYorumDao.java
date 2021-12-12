package dao;

import base.BaseDao;
import dto.UrunYorumCountDTO;
import dto.UrunYorumDetayDTO;
import org.hibernate.query.Query;

import java.util.List;

public class UrunYorumDao extends BaseDao {
    public List<UrunYorumDetayDTO> findAllReviewsOfProduct(){

        String sql = " select " +
                " new dto.UrunYorumDetayDTO( urunyorum.urun_id.adi, urunyorum.urun_id.kategori.adi, urunyorum.urun_id.fiyat, urunyorum.kullanici_id.adi, urunyorum.kullanici_id.soyadi, urunyorum.kullanici_id.email, urunyorum.kullanici_id.telefon, urunyorum.yorum, urunyorum.yorum_tarihi ) " +
                " from Urun urun " +
                " inner join Kategori kategori  on urun.kategori.id = kategori.id " +
                " inner join UrunYorum urunyorum  on urun.id = urunyorum.urun_id.id " +
                " inner join Kullanici kullanici  on urunyorum.kullanici_id.id = kullanici.id ";

        Query query = getCurrentSession().createQuery(sql);
        return query.list();
    }

    public List<UrunYorumCountDTO> findProductReviewCount(){
        String sql = " select " +
                " new dto.UrunYorumCountDTO( urun.id, urun.adi, urun.fiyat, count(urunyorum.yorum))" +
                " from Urun urun" +
                " left join UrunYorum urunyorum  on urun.id = urunyorum.urun_id.id" +
                " where 1=1" +
                " group by urun.id" +
                " order by urun.id";

        Query query = getCurrentSession().createQuery(sql);
        return query.list();
    }


}
