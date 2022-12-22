package com.example.blume

import androidx.lifecycle.ViewModel
import io.reactivex.rxjava3.subjects.BehaviorSubject

class PaketViewModel : ViewModel() {
    private var jumlahReaktif: Int = 0
    private var jumlah2 : Int = 0
    private var jumlah3 : Int = 0
    private var jumlah1 : Int = 0

    // Mendeklarasikan Subject untuk memancarkan jumlah pengunjung
    private val jumlahSubject: BehaviorSubject<Int> = BehaviorSubject.createDefault(0)
    private val jumlahSubject2: BehaviorSubject<Int> = BehaviorSubject.createDefault(0)
    private val jumlahSubject3: BehaviorSubject<Int> = BehaviorSubject.createDefault(0)

    // Untuk mengakses Subject dari Activity
    fun getJumlahSubject(): BehaviorSubject<Int> {
        return jumlahSubject
    }
    fun getJumlahSubject2(): BehaviorSubject<Int> {
        return jumlahSubject2
    }
    fun getJumlahSubject3(): BehaviorSubject<Int> {
        return jumlahSubject3
    }
    fun tambahReaktif(): Unit {
        jumlahReaktif += 1
        jumlahSubject.onNext(jumlahReaktif)

    }
    fun tambahReaktif2(): Unit {
        jumlah2 += 1
        jumlahSubject2.onNext(jumlah2)
    }
    fun tambahReaktif3(): Unit {
        jumlah3 += 1
        jumlahSubject3.onNext(jumlah3)
    }
    fun kurangReaktif(): Unit {
        if (jumlahReaktif!=0){
            jumlahReaktif -= 1
            jumlahSubject.onNext(jumlahReaktif)
        }
    }
    fun kurangReaktif2(): Unit {
        if (jumlah2!=0){
            jumlah2 -= 1
            jumlahSubject2.onNext(jumlah2)
        }
    }
    fun kurangReaktif3(): Unit {
        if (jumlah3!=0){
            jumlah3 -= 1
            jumlahSubject3.onNext(jumlah3)
        }
    }
}