import io.reactivex.Observable
import io.reactivex.rxkotlin.toObservable

fun main(args: Array<String>) {

    val observable: Observable<Any> = listOf("One", 2, "Three", "Four", 4.5, "Five", 6.0f).toObservable()//создадим поток
    observable.subscribe(observer)//подпишемся на наш поток, указав наблюдателя в аргументах
}