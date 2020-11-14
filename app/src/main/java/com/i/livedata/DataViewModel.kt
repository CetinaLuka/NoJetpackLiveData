package com.i.livedata

import android.util.Log
import androidx.lifecycle.ViewModel
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.subjects.BehaviorSubject

class DataViewModel: ViewModel() {
    lateinit var observableStevilo: BehaviorSubject<Int>
    fun vrniObservableStevilo(): Observable<Int> {
        if(!::observableStevilo.isInitialized)
            naloziStevilo()
        return observableStevilo
    }
    fun povecajStevilo(){ observableStevilo.onNext(observableStevilo.value + 1) }
    fun zmanjsajStevilo(){ observableStevilo.onNext(observableStevilo.value - 1) }
    fun naloziStevilo(){
        observableStevilo = BehaviorSubject.create()
        observableStevilo.onNext(1)
    }
}