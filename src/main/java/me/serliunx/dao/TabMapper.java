package me.serliunx.dao;

import me.serliunx.pojo.Tab;

import java.util.List;

public interface TabMapper {
    List<Tab> selectAllTabs();
    Tab getByTabNameEn(String tabName);
}