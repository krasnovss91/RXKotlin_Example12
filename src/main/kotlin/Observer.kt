
import io.reactivex.Observer
import io.reactivex.disposables.Disposable

val observer: Observer<Any> = object : Observer<Any> {//создадим наблюдателя и переопределим его методы
    override fun onComplete() {
        println("All Completed")
    }

    override fun onNext(item: Any) {
        println("Next $item")
    }

    override fun onError(e: Throwable) {
        println("Error Occured ${e.message}")
    }

    override fun onSubscribe(d: Disposable) {
        println("New Subscription ")
    }
}
