package com.github.bkhezry.weather.model.db;

import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.internal.CursorFactory;

// THIS CODE IS GENERATED BY ObjectBox, DO NOT EDIT.

/**
 * ObjectBox generated Cursor implementation for "ItemHourlyDB".
 * Note that this is a low-level class: usually you should stick to the Box class.
 */
public final class ItemHourlyDBCursor extends Cursor<ItemHourlyDB> {
    @Internal
    static final class Factory implements CursorFactory<ItemHourlyDB> {
        @Override
        public Cursor<ItemHourlyDB> createCursor(io.objectbox.Transaction tx, long cursorHandle, BoxStore boxStoreForEntities) {
            return new ItemHourlyDBCursor(tx, cursorHandle, boxStoreForEntities);
        }
    }

    private static final ItemHourlyDB_.ItemHourlyDBIdGetter ID_GETTER = ItemHourlyDB_.__ID_GETTER;


    private final static int __ID_fiveDayWeatherId = ItemHourlyDB_.fiveDayWeatherId.id;
    private final static int __ID_dt = ItemHourlyDB_.dt.id;
    private final static int __ID_temp = ItemHourlyDB_.temp.id;
    private final static int __ID_weatherCode = ItemHourlyDB_.weatherCode.id;

    public ItemHourlyDBCursor(io.objectbox.Transaction tx, long cursor, BoxStore boxStore) {
        super(tx, cursor, ItemHourlyDB_.__INSTANCE, boxStore);
    }

    @Override
    public final long getId(ItemHourlyDB entity) {
        return ID_GETTER.getId(entity);
    }

    /**
     * Puts an object into its box.
     *
     * @return The ID of the object within its box.
     */
    @Override
    public final long put(ItemHourlyDB entity) {
        long __assignedId = collect313311(cursor, entity.getId(), PUT_FLAG_FIRST | PUT_FLAG_COMPLETE,
                0, null, 0, null,
                0, null, 0, null,
                __ID_fiveDayWeatherId, entity.getFiveDayWeatherId(), __ID_dt, entity.getDt(),
                __ID_weatherCode, entity.getWeatherCode(), 0, 0,
                0, 0, 0, 0,
                0, 0, __ID_temp, entity.getTemp());

        entity.setId(__assignedId);

        return __assignedId;
    }

}
