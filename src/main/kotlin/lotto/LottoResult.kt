package lotto

class LottoResult(
    val lottoRank: LottoRank,
) {
    var count: Int = 0

    fun count() {
        count++
    }

    fun sum(): Int {
        return lottoRank.sumPrice(count)
    }
}