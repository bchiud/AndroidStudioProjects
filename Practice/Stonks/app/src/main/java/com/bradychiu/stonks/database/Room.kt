package com.bradychiu.stonks.database

// import android.content.Context
// import androidx.lifecycle.LiveData
// import androidx.room.*
// import com.bradychiu.stonks.database.model.DailyAdjusted
//
// @Dao
// interface DailyAdjustedDao {
//     @Query("SELECT symbol FROM dailyadjusted GROUP BY symbol")
//     fun getDailyAdjustedSymbols(): LiveData<List<String>>
//
//     @Query("SELECT *  FROM dailyadjusted WHERE symbol = (:symbol)")
//     fun getDailyAdjusted(symbol: String): LiveData<DailyAdjusted>
//
//     @Insert(onConflict = OnConflictStrategy.REPLACE)
//     fun insertDailyAdjusted(dailyAdjusted: DailyAdjusted)
// }
//
// @Database(entities = [DailyAdjusted::class], version = 1)
// abstract class StonksDatabase : RoomDatabase() {
//     abstract fun dailyAdjustedDao(): DailyAdjustedDao
// }
//
// private lateinit var INSTANCE: StonksDatabase
//
// fun getDatabase(context: Context): StonksDatabase {
//     synchronized(StonksDatabase::class.java) {
//         if (!::INSTANCE.isInitialized) {
//             INSTANCE = Room.databaseBuilder(
//                 context.applicationContext,
//                 StonksDatabase::class.java,
//                 "stonks"
//             ).build()
//         }
//     }
//     return INSTANCE
// }