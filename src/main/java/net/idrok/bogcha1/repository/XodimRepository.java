package net.idrok.bogcha1.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.idrok.bogcha1.entity.Xodim;
import net.idrok.bogcha1.entity.XodimStatus;

@Repository
public interface XodimRepository extends JpaRepository<Xodim, Long> {

    Page<Xodim> findAllByIsmContainingIgnoreCaseOrFamilyaContainingIgnoreCase(String key,
            String key2, Pageable pageable);

    Page<Xodim> findByXodimStatus(XodimStatus xodimStatus,Pageable pageable);

    default Page<Xodim> findByXodimStatusFAOL(XodimStatus xodimStatus,Pageable pageable){
        return this.findByXodimStatus(XodimStatus.FAOL, pageable);
    }
    default Page<Xodim> findByXodimStatusNOFAOL(XodimStatus xodimStatus,Pageable pageable){
        return this.findByXodimStatus(XodimStatus.NOFAOL, pageable);
    }



    // @Query("FROM XODIM x WHERE x.xodimStatus = net.idrok.bogcha1.entity.XodimStatus.NOFAOL")
    // Page<Xodim> findByXodimStatusNOFAOL();

    

} 
