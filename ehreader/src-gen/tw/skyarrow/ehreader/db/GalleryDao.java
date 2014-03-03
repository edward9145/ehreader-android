package tw.skyarrow.ehreader.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import tw.skyarrow.ehreader.db.Gallery;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table GALLERY.
*/
public class GalleryDao extends AbstractDao<Gallery, Long> {

    public static final String TABLENAME = "GALLERY";

    /**
     * Properties of entity Gallery.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property Token = new Property(1, String.class, "token", false, "TOKEN");
        public final static Property Title = new Property(2, String.class, "title", false, "TITLE");
        public final static Property Subtitle = new Property(3, String.class, "subtitle", false, "SUBTITLE");
        public final static Property Category = new Property(4, Integer.class, "category", false, "CATEGORY");
        public final static Property Count = new Property(5, Integer.class, "count", false, "COUNT");
        public final static Property Thumbnail = new Property(6, String.class, "thumbnail", false, "THUMBNAIL");
        public final static Property Starred = new Property(7, Boolean.class, "starred", false, "STARRED");
        public final static Property Rating = new Property(8, Float.class, "rating", false, "RATING");
        public final static Property Created = new Property(9, java.util.Date.class, "created", false, "CREATED");
        public final static Property Lastread = new Property(10, java.util.Date.class, "lastread", false, "LASTREAD");
        public final static Property Tags = new Property(11, String.class, "tags", false, "TAGS");
        public final static Property Uploader = new Property(12, String.class, "uploader", false, "UPLOADER");
        public final static Property Progress = new Property(13, Integer.class, "progress", false, "PROGRESS");
        public final static Property Showkey = new Property(14, String.class, "showkey", false, "SHOWKEY");
        public final static Property Size = new Property(15, Long.class, "size", false, "SIZE");
    };

    private DaoSession daoSession;


    public GalleryDao(DaoConfig config) {
        super(config);
    }
    
    public GalleryDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
        this.daoSession = daoSession;
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "'GALLERY' (" + //
                "'_id' INTEGER PRIMARY KEY ," + // 0: id
                "'TOKEN' TEXT NOT NULL ," + // 1: token
                "'TITLE' TEXT," + // 2: title
                "'SUBTITLE' TEXT," + // 3: subtitle
                "'CATEGORY' INTEGER," + // 4: category
                "'COUNT' INTEGER," + // 5: count
                "'THUMBNAIL' TEXT," + // 6: thumbnail
                "'STARRED' INTEGER," + // 7: starred
                "'RATING' REAL," + // 8: rating
                "'CREATED' INTEGER," + // 9: created
                "'LASTREAD' INTEGER," + // 10: lastread
                "'TAGS' TEXT," + // 11: tags
                "'UPLOADER' TEXT," + // 12: uploader
                "'PROGRESS' INTEGER," + // 13: progress
                "'SHOWKEY' TEXT," + // 14: showkey
                "'SIZE' INTEGER);"); // 15: size
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "'GALLERY'";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, Gallery entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
        stmt.bindString(2, entity.getToken());
 
        String title = entity.getTitle();
        if (title != null) {
            stmt.bindString(3, title);
        }
 
        String subtitle = entity.getSubtitle();
        if (subtitle != null) {
            stmt.bindString(4, subtitle);
        }
 
        Integer category = entity.getCategory();
        if (category != null) {
            stmt.bindLong(5, category);
        }
 
        Integer count = entity.getCount();
        if (count != null) {
            stmt.bindLong(6, count);
        }
 
        String thumbnail = entity.getThumbnail();
        if (thumbnail != null) {
            stmt.bindString(7, thumbnail);
        }
 
        Boolean starred = entity.getStarred();
        if (starred != null) {
            stmt.bindLong(8, starred ? 1l: 0l);
        }
 
        Float rating = entity.getRating();
        if (rating != null) {
            stmt.bindDouble(9, rating);
        }
 
        java.util.Date created = entity.getCreated();
        if (created != null) {
            stmt.bindLong(10, created.getTime());
        }
 
        java.util.Date lastread = entity.getLastread();
        if (lastread != null) {
            stmt.bindLong(11, lastread.getTime());
        }
 
        String tags = entity.getTags();
        if (tags != null) {
            stmt.bindString(12, tags);
        }
 
        String uploader = entity.getUploader();
        if (uploader != null) {
            stmt.bindString(13, uploader);
        }
 
        Integer progress = entity.getProgress();
        if (progress != null) {
            stmt.bindLong(14, progress);
        }
 
        String showkey = entity.getShowkey();
        if (showkey != null) {
            stmt.bindString(15, showkey);
        }
 
        Long size = entity.getSize();
        if (size != null) {
            stmt.bindLong(16, size);
        }
    }

    @Override
    protected void attachEntity(Gallery entity) {
        super.attachEntity(entity);
        entity.__setDaoSession(daoSession);
    }

    /** @inheritdoc */
    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public Gallery readEntity(Cursor cursor, int offset) {
        Gallery entity = new Gallery( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.getString(offset + 1), // token
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // title
            cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3), // subtitle
            cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4), // category
            cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5), // count
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // thumbnail
            cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0, // starred
            cursor.isNull(offset + 8) ? null : cursor.getFloat(offset + 8), // rating
            cursor.isNull(offset + 9) ? null : new java.util.Date(cursor.getLong(offset + 9)), // created
            cursor.isNull(offset + 10) ? null : new java.util.Date(cursor.getLong(offset + 10)), // lastread
            cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11), // tags
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // uploader
            cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13), // progress
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // showkey
            cursor.isNull(offset + 15) ? null : cursor.getLong(offset + 15) // size
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, Gallery entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setToken(cursor.getString(offset + 1));
        entity.setTitle(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setSubtitle(cursor.isNull(offset + 3) ? null : cursor.getString(offset + 3));
        entity.setCategory(cursor.isNull(offset + 4) ? null : cursor.getInt(offset + 4));
        entity.setCount(cursor.isNull(offset + 5) ? null : cursor.getInt(offset + 5));
        entity.setThumbnail(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setStarred(cursor.isNull(offset + 7) ? null : cursor.getShort(offset + 7) != 0);
        entity.setRating(cursor.isNull(offset + 8) ? null : cursor.getFloat(offset + 8));
        entity.setCreated(cursor.isNull(offset + 9) ? null : new java.util.Date(cursor.getLong(offset + 9)));
        entity.setLastread(cursor.isNull(offset + 10) ? null : new java.util.Date(cursor.getLong(offset + 10)));
        entity.setTags(cursor.isNull(offset + 11) ? null : cursor.getString(offset + 11));
        entity.setUploader(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setProgress(cursor.isNull(offset + 13) ? null : cursor.getInt(offset + 13));
        entity.setShowkey(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setSize(cursor.isNull(offset + 15) ? null : cursor.getLong(offset + 15));
     }
    
    /** @inheritdoc */
    @Override
    protected Long updateKeyAfterInsert(Gallery entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    /** @inheritdoc */
    @Override
    public Long getKey(Gallery entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    /** @inheritdoc */
    @Override    
    protected boolean isEntityUpdateable() {
        return true;
    }
    
}