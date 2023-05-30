package com.github.bkhezry.weather.model.db;

import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.annotation.apihint.Internal;
import io.objectbox.internal.CursorFactory;

// THIS CODE IS GENERATED BY ObjectBox, DO NOT EDIT.

/**
 * ObjectBox generated Cursor implementation for "CurrentWeather".
 * Note that this is a low-level class: usually you should stick to the Box class.
 */
public final class CurrentWeatherCursor extends Cursor<CurrentWeather> {
    @Internal
    static final class Factory implements CursorFactory<CurrentWeather> {
        @Override
        public Cursor<CurrentWeather> createCursor(io.objectbox.Transaction tx, long cursorHandle, BoxStore boxStoreForEntities) {
            return new CurrentWeatherCursor(tx, cursorHandle, boxStoreForEntities);
        }
    }

    private static final CurrentWeather_.CurrentWeatherIdGetter ID_GETTER = CurrentWeather_.__ID_GETTER;


    private final static int __ID_temp = CurrentWeather_.temp.id;
    private final static int __ID_humidity = CurrentWeather_.humidity.id;
    private final static int __ID_description = CurrentWeather_.description.id;
    private final static int __ID_main = CurrentWeather_.main.id;
    private final static int __ID_weatherId = CurrentWeather_.weatherId.id;
    private final static int __ID_windDeg = CurrentWeather_.windDeg.id;
    private final static int __ID_windSpeed = CurrentWeather_.windSpeed.id;
    private final static int __ID_storeTimestamp = CurrentWeather_.storeTimestamp.id;

    public CurrentWeatherCursor(io.objectbox.Transaction tx, long cursor, BoxStore boxStore) {
        super(tx, cursor, CurrentWeather_.__INSTANCE, boxStore);
    }

    @Override
    public final long getId(CurrentWeather entity) {
        return ID_GETTER.getId(entity);
    }

    /**
     * Puts an object into its box.
     *
     * @return The ID of the object within its box.
     */
    @Override
    public final long put(CurrentWeather entity) {
        String description = entity.getDescription();
        int __id3 = description != null ? __ID_description : 0;
        String main = entity.getMain();
        int __id4 = main != null ? __ID_main : 0;

        collect313311(cursor, 0, PUT_FLAG_FIRST,
                __id3, description, __id4, main,
                0, null, 0, null,
                __ID_storeTimestamp, entity.getStoreTimestamp(), __ID_humidity, entity.getHumidity(),
                __ID_weatherId, entity.getWeatherId(), 0, 0,
                0, 0, 0, 0,
                0, 0, __ID_temp, entity.getTemp());

        long __assignedId = collect002033(cursor, entity.getId(), PUT_FLAG_COMPLETE,
                0, 0, 0, 0,
                0, 0, 0, 0,
                0, 0, __ID_windDeg, entity.getWindDeg(),
                __ID_windSpeed, entity.getWindSpeed(), 0, 0);

        entity.setId(__assignedId);

        return __assignedId;
    }

}