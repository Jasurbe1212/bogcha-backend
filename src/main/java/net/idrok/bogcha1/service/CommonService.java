package net.idrok.bogcha1.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CommonService<T> {
    
    /**
     * Bu metod bazadan barcha @{T}larni o'qib olishga mo'ljallangan
     * @param pageable - qidiruv uchun kalit so'z
     * @return entity turidagi List
     */
    public Page<T> getAll(Pageable pageable);

    /**
     * Bu metod bazadan barcha @{T}larni o'qib olishga mo'ljallangan
     * @param pageable - qidiruv uchun kalit so'z
     * @return entity turidagi List
     */
    public Page<T> getAll(String key,Pageable pageable);

    /**
     * Bu metod entityni id'si bo'yicha olib kelishga mo'ljallangandir
     * @param id Long turidagi o'zgaruvchi
     * @return Topilgan entity
     */
    public T getById(Long id);
    /**
     * Bu metod yangi entityni qo'shish uchun mo'jlallanag
     * @param entity entity turidagi o'zgaruvchi
     * @return yangi qo'shilgan entity qaytariladi.
     */
    public T create(T entity);
    /**
     * Bu metod entityni o'zgartirish uchun mo'jlallanag
     * @param entity entity turidagi o'zgaruvchi
     * @return o'zgartirilgan entity qaytariladi.
     */
    public T update(T entity);
    /**
     * Bu metod entityni o'chirish uchun mo'jlallanag
     * @param entity entity turidagi o'zgaruvchi
     * @return void
     */
    public void delete(T entity);
    /**
     * Bu metod entityni o'chirish uchun mo'jlallanag
     * @param dataId Long turidagi o'zgaruvchi
     * @return void
     */
    public void deleteById(Long dataId);
}

