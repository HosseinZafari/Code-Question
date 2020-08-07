package hosseinzafari.github.codequestion.data.main

import androidx.lifecycle.LiveData

/*

@created in 07/08/2020 - 10:47 AM
@project Code Question
@author Hossein Zafari 
@email  hosseinzafari2000@gmail.com 
*/

interface TokenMain {
    
    
    suspend fun getToken(): LiveData<String?>
    
    suspend fun setToken(token: String)
    
}