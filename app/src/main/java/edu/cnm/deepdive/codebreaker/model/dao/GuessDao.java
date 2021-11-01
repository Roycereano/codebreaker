package edu.cnm.deepdive.codebreaker.model.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import edu.cnm.deepdive.codebreaker.model.entity.Guess;
import io.reactivex.Single;
import java.util.Collection;
import java.util.List;

@Dao
public interface GuessDao {

  @Insert
  Single<Long> insert(Guess guess);
  
  @Insert
  Single<List<Long>> insert(Guess... guess);
  
  @Insert
  Single<List<Long>> insert(Collection<Guess> guess);
  
  @Update
  Single<Integer> update(Guess guess);
  
  @Update
  Single<Integer> update(Guess... guess);
  
  @Update
  Single<Integer> update(Collection<Guess> guess);
  
  @Delete
  Single<Integer> delete(Guess guess);
  
  @Delete
  Single<Integer> delete(Guess... guess);
  
  @Delete
  Single<Integer> delete(Collection<Guess> guess);
  
  @Query("SELECT * FROM guess ORDER BY created DESC")
  LiveData<List<Guess>> SelectAll();
  
  @Query("SELECT * FROM guess WHERE guess_id = :guessId")
  LiveData<Guess> select(long guessId);
}
