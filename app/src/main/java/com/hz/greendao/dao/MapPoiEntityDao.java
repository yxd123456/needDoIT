package com.hz.greendao.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteStatement;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.internal.DaoConfig;

import com.hz.greendao.dao.MapPoiEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "MAP_POI_ENTITY".
*/
public class MapPoiEntityDao extends AbstractDao<MapPoiEntity, String> {

    public static final String TABLENAME = "MAP_POI_ENTITY";

    /**
     * Properties of entity MapPoiEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
    */
    public static class Properties {
        public final static Property PointId = new Property(0, String.class, "pointId", true, "POINT_ID");
        public final static Property PointProjId = new Property(1, long.class, "pointProjId", false, "POINT_PROJ_ID");
        public final static Property PointUserId = new Property(2, long.class, "pointUserId", false, "POINT_USER_ID");
        public final static Property PointEditType = new Property(3, int.class, "pointEditType", false, "POINT_EDIT_TYPE");
        public final static Property PointType = new Property(4, int.class, "pointType", false, "POINT_TYPE");
        public final static Property PointLatitude = new Property(5, double.class, "pointLatitude", false, "POINT_LATITUDE");
        public final static Property PointLongitude = new Property(6, double.class, "pointLongitude", false, "POINT_LONGITUDE");
        public final static Property PointName = new Property(7, String.class, "pointName", false, "POINT_NAME");
        public final static Property PointNote = new Property(8, String.class, "pointNote", false, "POINT_NOTE");
        public final static Property PointRemoved = new Property(9, int.class, "pointRemoved", false, "POINT_REMOVED");
        public final static Property PointNeedToUpload = new Property(10, boolean.class, "pointNeedToUpload", false, "POINT_NEED_TO_UPLOAD");
        public final static Property PointUpdateDate = new Property(11, java.util.Date.class, "pointUpdateDate", false, "POINT_UPDATE_DATE");
        public final static Property PointLightingNum = new Property(12, int.class, "pointLightingNum", false, "POINT_LIGHTING_NUM");
        public final static Property PointPowerNum = new Property(13, int.class, "pointPowerNum", false, "POINT_POWER_NUM");
        public final static Property PointConnectDoorNum = new Property(14, int.class, "pointConnectDoorNum", false, "POINT_CONNECT_DOOR_NUM");
        public final static Property PointTransformerTypeId = new Property(15, String.class, "pointTransformerTypeId", false, "POINT_TRANSFORMER_TYPE_ID");
        public final static Property PointStatus = new Property(16, int.class, "pointStatus", false, "POINT_STATUS");
        public final static Property PointTowerTypeId = new Property(17, String.class, "pointTowerTypeId", false, "POINT_TOWER_TYPE_ID");
        public final static Property PointGeologicalConditionsTypeId = new Property(18, String.class, "pointGeologicalConditionsTypeId", false, "POINT_GEOLOGICAL_CONDITIONS_TYPE_ID");
        public final static Property PointEquipmentInstallationTypeId = new Property(19, String.class, "pointEquipmentInstallationTypeId", false, "POINT_EQUIPMENT_INSTALLATION_TYPE_ID");
        public final static Property PointElectricPoleTypeId = new Property(20, String.class, "pointElectricPoleTypeId", false, "POINT_ELECTRIC_POLE_TYPE_ID");
        public final static Property PointElectricPoleTypeCount = new Property(21, int.class, "pointElectricPoleTypeCount", false, "POINT_ELECTRIC_POLE_TYPE_COUNT");
        public final static Property PointLandForm = new Property(22, String.class, "pointLandForm", false, "POINT_LAND_FORM");
        public final static Property PointNum = new Property(23, String.class, "pointNum", false, "POINT_NUM");
        public final static Property PointCoverDepth = new Property(24, Double.class, "pointCoverDepth", false, "POINT_COVER_DEPTH");
    };


    public MapPoiEntityDao(DaoConfig config) {
        super(config);
    }
    
    public MapPoiEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(SQLiteDatabase db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"MAP_POI_ENTITY\" (" + //
                "\"POINT_ID\" TEXT PRIMARY KEY NOT NULL ," + // 0: pointId
                "\"POINT_PROJ_ID\" INTEGER NOT NULL ," + // 1: pointProjId
                "\"POINT_USER_ID\" INTEGER NOT NULL ," + // 2: pointUserId
                "\"POINT_EDIT_TYPE\" INTEGER NOT NULL ," + // 3: pointEditType
                "\"POINT_TYPE\" INTEGER NOT NULL ," + // 4: pointType
                "\"POINT_LATITUDE\" REAL NOT NULL ," + // 5: pointLatitude
                "\"POINT_LONGITUDE\" REAL NOT NULL ," + // 6: pointLongitude
                "\"POINT_NAME\" TEXT," + // 7: pointName
                "\"POINT_NOTE\" TEXT," + // 8: pointNote
                "\"POINT_REMOVED\" INTEGER NOT NULL ," + // 9: pointRemoved
                "\"POINT_NEED_TO_UPLOAD\" INTEGER NOT NULL ," + // 10: pointNeedToUpload
                "\"POINT_UPDATE_DATE\" INTEGER NOT NULL ," + // 11: pointUpdateDate
                "\"POINT_LIGHTING_NUM\" INTEGER NOT NULL ," + // 12: pointLightingNum
                "\"POINT_POWER_NUM\" INTEGER NOT NULL ," + // 13: pointPowerNum
                "\"POINT_CONNECT_DOOR_NUM\" INTEGER NOT NULL ," + // 14: pointConnectDoorNum
                "\"POINT_TRANSFORMER_TYPE_ID\" TEXT," + // 15: pointTransformerTypeId
                "\"POINT_STATUS\" INTEGER NOT NULL ," + // 16: pointStatus
                "\"POINT_TOWER_TYPE_ID\" TEXT," + // 17: pointTowerTypeId
                "\"POINT_GEOLOGICAL_CONDITIONS_TYPE_ID\" TEXT," + // 18: pointGeologicalConditionsTypeId
                "\"POINT_EQUIPMENT_INSTALLATION_TYPE_ID\" TEXT," + // 19: pointEquipmentInstallationTypeId
                "\"POINT_ELECTRIC_POLE_TYPE_ID\" TEXT," + // 20: pointElectricPoleTypeId
                "\"POINT_ELECTRIC_POLE_TYPE_COUNT\" INTEGER NOT NULL ," + // 21: pointElectricPoleTypeCount
                "\"POINT_LAND_FORM\" TEXT," + // 22: pointLandForm
                "\"POINT_NUM\" TEXT," + // 23: pointNum
                "\"POINT_COVER_DEPTH\" REAL);"); // 24: pointCoverDepth
        // Add Indexes
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAP_POI_ENTITY_POINT_ID ON MAP_POI_ENTITY" +
                " (\"POINT_ID\");");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAP_POI_ENTITY_POINT_PROJ_ID ON MAP_POI_ENTITY" +
                " (\"POINT_PROJ_ID\");");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAP_POI_ENTITY_POINT_USER_ID ON MAP_POI_ENTITY" +
                " (\"POINT_USER_ID\");");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAP_POI_ENTITY_POINT_EDIT_TYPE ON MAP_POI_ENTITY" +
                " (\"POINT_EDIT_TYPE\");");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAP_POI_ENTITY_POINT_TYPE ON MAP_POI_ENTITY" +
                " (\"POINT_TYPE\");");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAP_POI_ENTITY_POINT_LATITUDE ON MAP_POI_ENTITY" +
                " (\"POINT_LATITUDE\");");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAP_POI_ENTITY_POINT_LONGITUDE ON MAP_POI_ENTITY" +
                " (\"POINT_LONGITUDE\");");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAP_POI_ENTITY_POINT_REMOVED ON MAP_POI_ENTITY" +
                " (\"POINT_REMOVED\");");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAP_POI_ENTITY_POINT_NEED_TO_UPLOAD ON MAP_POI_ENTITY" +
                " (\"POINT_NEED_TO_UPLOAD\");");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAP_POI_ENTITY_POINT_UPDATE_DATE ON MAP_POI_ENTITY" +
                " (\"POINT_UPDATE_DATE\");");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAP_POI_ENTITY_POINT_LIGHTING_NUM ON MAP_POI_ENTITY" +
                " (\"POINT_LIGHTING_NUM\");");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAP_POI_ENTITY_POINT_POWER_NUM ON MAP_POI_ENTITY" +
                " (\"POINT_POWER_NUM\");");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAP_POI_ENTITY_POINT_CONNECT_DOOR_NUM ON MAP_POI_ENTITY" +
                " (\"POINT_CONNECT_DOOR_NUM\");");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAP_POI_ENTITY_POINT_STATUS ON MAP_POI_ENTITY" +
                " (\"POINT_STATUS\");");
        db.execSQL("CREATE INDEX " + constraint + "IDX_MAP_POI_ENTITY_POINT_ELECTRIC_POLE_TYPE_COUNT ON MAP_POI_ENTITY" +
                " (\"POINT_ELECTRIC_POLE_TYPE_COUNT\");");
    }

    /** Drops the underlying database table. */
    public static void dropTable(SQLiteDatabase db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"MAP_POI_ENTITY\"";
        db.execSQL(sql);
    }

    /** @inheritdoc */
    @Override
    protected void bindValues(SQLiteStatement stmt, MapPoiEntity entity) {
        stmt.clearBindings();
        stmt.bindString(1, entity.getPointId());
        stmt.bindLong(2, entity.getPointProjId());
        stmt.bindLong(3, entity.getPointUserId());
        stmt.bindLong(4, entity.getPointEditType());
        stmt.bindLong(5, entity.getPointType());
        stmt.bindDouble(6, entity.getPointLatitude());
        stmt.bindDouble(7, entity.getPointLongitude());
 
        String pointName = entity.getPointName();
        if (pointName != null) {
            stmt.bindString(8, pointName);
        }
 
        String pointNote = entity.getPointNote();
        if (pointNote != null) {
            stmt.bindString(9, pointNote);
        }
        stmt.bindLong(10, entity.getPointRemoved());
        stmt.bindLong(11, entity.getPointNeedToUpload() ? 1L: 0L);
        stmt.bindLong(12, entity.getPointUpdateDate().getTime());
        stmt.bindLong(13, entity.getPointLightingNum());
        stmt.bindLong(14, entity.getPointPowerNum());
        stmt.bindLong(15, entity.getPointConnectDoorNum());
 
        String pointTransformerTypeId = entity.getPointTransformerTypeId();
        if (pointTransformerTypeId != null) {
            stmt.bindString(16, pointTransformerTypeId);
        }
        stmt.bindLong(17, entity.getPointStatus());
 
        String pointTowerTypeId = entity.getPointTowerTypeId();
        if (pointTowerTypeId != null) {
            stmt.bindString(18, pointTowerTypeId);
        }
 
        String pointGeologicalConditionsTypeId = entity.getPointGeologicalConditionsTypeId();
        if (pointGeologicalConditionsTypeId != null) {
            stmt.bindString(19, pointGeologicalConditionsTypeId);
        }
 
        String pointEquipmentInstallationTypeId = entity.getPointEquipmentInstallationTypeId();
        if (pointEquipmentInstallationTypeId != null) {
            stmt.bindString(20, pointEquipmentInstallationTypeId);
        }
 
        String pointElectricPoleTypeId = entity.getPointElectricPoleTypeId();
        if (pointElectricPoleTypeId != null) {
            stmt.bindString(21, pointElectricPoleTypeId);
        }
        stmt.bindLong(22, entity.getPointElectricPoleTypeCount());
 
        String pointLandForm = entity.getPointLandForm();
        if (pointLandForm != null) {
            stmt.bindString(23, pointLandForm);
        }
 
        String pointNum = entity.getPointNum();
        if (pointNum != null) {
            stmt.bindString(24, pointNum);
        }
 
        Double pointCoverDepth = entity.getPointCoverDepth();
        if (pointCoverDepth != null) {
            stmt.bindDouble(25, pointCoverDepth);
        }
    }

    /** @inheritdoc */
    @Override
    public String readKey(Cursor cursor, int offset) {
        return cursor.getString(offset + 0);
    }    

    /** @inheritdoc */
    @Override
    public MapPoiEntity readEntity(Cursor cursor, int offset) {
        MapPoiEntity entity = new MapPoiEntity( //
            cursor.getString(offset + 0), // pointId
            cursor.getLong(offset + 1), // pointProjId
            cursor.getLong(offset + 2), // pointUserId
            cursor.getInt(offset + 3), // pointEditType
            cursor.getInt(offset + 4), // pointType
            cursor.getDouble(offset + 5), // pointLatitude
            cursor.getDouble(offset + 6), // pointLongitude
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // pointName
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // pointNote
            cursor.getInt(offset + 9), // pointRemoved
            cursor.getShort(offset + 10) != 0, // pointNeedToUpload
            new java.util.Date(cursor.getLong(offset + 11)), // pointUpdateDate
            cursor.getInt(offset + 12), // pointLightingNum
            cursor.getInt(offset + 13), // pointPowerNum
            cursor.getInt(offset + 14), // pointConnectDoorNum
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // pointTransformerTypeId
            cursor.getInt(offset + 16), // pointStatus
            cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17), // pointTowerTypeId
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // pointGeologicalConditionsTypeId
            cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19), // pointEquipmentInstallationTypeId
            cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20), // pointElectricPoleTypeId
            cursor.getInt(offset + 21), // pointElectricPoleTypeCount
            cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22), // pointLandForm
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // pointNum
            cursor.isNull(offset + 24) ? null : cursor.getDouble(offset + 24) // pointCoverDepth
        );
        return entity;
    }
     
    /** @inheritdoc */
    @Override
    public void readEntity(Cursor cursor, MapPoiEntity entity, int offset) {
        entity.setPointId(cursor.getString(offset + 0));
        entity.setPointProjId(cursor.getLong(offset + 1));
        entity.setPointUserId(cursor.getLong(offset + 2));
        entity.setPointEditType(cursor.getInt(offset + 3));
        entity.setPointType(cursor.getInt(offset + 4));
        entity.setPointLatitude(cursor.getDouble(offset + 5));
        entity.setPointLongitude(cursor.getDouble(offset + 6));
        entity.setPointName(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setPointNote(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setPointRemoved(cursor.getInt(offset + 9));
        entity.setPointNeedToUpload(cursor.getShort(offset + 10) != 0);
        entity.setPointUpdateDate(new java.util.Date(cursor.getLong(offset + 11)));
        entity.setPointLightingNum(cursor.getInt(offset + 12));
        entity.setPointPowerNum(cursor.getInt(offset + 13));
        entity.setPointConnectDoorNum(cursor.getInt(offset + 14));
        entity.setPointTransformerTypeId(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setPointStatus(cursor.getInt(offset + 16));
        entity.setPointTowerTypeId(cursor.isNull(offset + 17) ? null : cursor.getString(offset + 17));
        entity.setPointGeologicalConditionsTypeId(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setPointEquipmentInstallationTypeId(cursor.isNull(offset + 19) ? null : cursor.getString(offset + 19));
        entity.setPointElectricPoleTypeId(cursor.isNull(offset + 20) ? null : cursor.getString(offset + 20));
        entity.setPointElectricPoleTypeCount(cursor.getInt(offset + 21));
        entity.setPointLandForm(cursor.isNull(offset + 22) ? null : cursor.getString(offset + 22));
        entity.setPointNum(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setPointCoverDepth(cursor.isNull(offset + 24) ? null : cursor.getDouble(offset + 24));
     }
    
    /** @inheritdoc */
    @Override
    protected String updateKeyAfterInsert(MapPoiEntity entity, long rowId) {
        return entity.getPointId();
    }
    
    /** @inheritdoc */
    @Override
    public String getKey(MapPoiEntity entity) {
        if(entity != null) {
            return entity.getPointId();
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