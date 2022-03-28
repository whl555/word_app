package utils;


import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.Entity;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import bean.Word;
import dao.WordDao;

@Database(entities = {Word.class}, version = 1) // 包含word实体类,数据库版本为1
public abstract class AppDatabase extends RoomDatabase {

    //取得接口的实例,接口实现由Room ORM映射
    public abstract WordDao wordDao();

}
