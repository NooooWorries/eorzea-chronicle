package com.czxbnb.eorzea.api

import com.czxbnb.eorzea.model.LodestoneCharacter
import com.czxbnb.eorzea.util.BASE_URL_XIVAPI
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CharacterApi {
    companion object {
        fun create(): CharacterApi {
            val httpLoggingInterceptor = HttpLoggingInterceptor()

            val okHttpClient = OkHttpClient.Builder()
                .addInterceptor(httpLoggingInterceptor)
                .build()

            return Retrofit.Builder()
                .baseUrl(BASE_URL_XIVAPI)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(CharacterApi::class.java)
        }
    }

    /**
     * Get Character data, this is parsed straight from Lodestone in real-time.
     * The more data you request the slower the entire request will be. AC and FCM are done asynchronously.
     * @param lodestoneId User's lodestone id
     * @param extended If set to 1, the API will return more data in the response by extending out the data IDs to useful objects.
     * @param data AC: Achievement, FR: Friends List, FC: Free Company, FCM: Free Company Members, MIMO: Mounts and Minions, PVP: PVP Team
     * @return Lodestone character information [LodestoneCharacter]
     */
    @GET("character/{lodestone_id}")
    suspend fun getLodestoneCharacter(
        @Path("lodestone_id") lodestoneId: String? = "",
        @Query("extended") extended: Int? = 1,
        @Query("data") data: String? = "AC,FR,FC,MIMO"
    ): LodestoneCharacter
}
