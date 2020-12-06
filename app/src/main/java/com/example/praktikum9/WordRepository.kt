package com.example.praktikum9

import androidx.lifecycle.LiveData

class WordRepository(private val wordDao: WordDAO) {
    val allWords: LiveData<List<Word>> = wordDao.getAlphabetizedWords()
    suspend fun insert(word: Word){
        wordDao.insert(word)
    }
    suspend fun deleteAll(){
        wordDao.deleteAll()
    }
}