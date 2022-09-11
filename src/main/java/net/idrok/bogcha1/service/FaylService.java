package net.idrok.bogcha1.service;

import net.idrok.bogcha1.entity.Fayl;

import java.util.List;

public interface FaylService extends CommonService<Fayl>{
    List<Fayl> getAll(String key);
}
