package utils;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteDBUtil extends SQLiteOpenHelper {

	public static final String NAME = "easytablemore";
	public static final int VERSION = 2;//��Ϊ����һ�����ݿ⣬���Ը��°汾��Ϊ2

	/**
	 * content�����Ķ��� name���ݿ����� factory���ݿ⹤�� version�汾
	 * @param context
	 */
	public SQLiteDBUtil(Context context) {
		super(context, NAME, null, VERSION);
		// TODO Auto-generated constructor stub
	}

	//
	@Override
	public void onCreate(SQLiteDatabase db) {

		String userSQL = "create table words"
				+ "(id integer primary key autoincrement,"
				+ "account varchar(20)," + "courseId integer,"
				+ "name varchar(20)," + "teacher varchar(20),"
				+ "place varchar(20)," + "term integer," + "week varchar(20))";
		db.execSQL(userSQL);
		
		//����µı�   ��Ҫ�ڸ�������д������������Ҫ���°汾��
		String noteSQL = "create table note"
				+ "(id integer primary key autoincrement,"
				+ "account varchar(20)," + "title varchar(20),"
				+ "course varchar(20)," + "content varchar(5000),"
				+ "time date)";
		db.execSQL(noteSQL);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
		//����µı�   ��Ҫ�ڸ�������д������������Ҫ���°汾��
		String noteSQL = "create table note"
				+ "(id integer primary key autoincrement,"
				+ "account varchar(20)," + "title varchar(20),"
				+ "course varchar(20)," + "content varchar(5000),"
				+ "time date)";
		db.execSQL(noteSQL);

	}

}
