package dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.ArrayList;
import java.util.List;

import bean.Word;

@Dao
public interface WordDao {
    //Dao的用法查询

    //查询所有word
    @Query("SELECT * FROM word")
    List<Word> getAll();

    //根据word ids查询 word列表
    @Query("SELECT * FROM word WHERE id IN (:wordIds)")
    List<Word> loadAllByIds(int[] wordIds);
    //根据name查询
    @Query("SELECT * FROM word WHERE name LIKE :name" +
            " LIMIT 1")
    Word findByName(String name);
    //根据prefix查询
    @Query("SELECT * FROM word WHERE prefix LIKE :prefix")
    List<Word> findByPrefix(String prefix);

    @Insert
    void  insertWords(Word word);

    @Delete
    void delete(Word word);


}
