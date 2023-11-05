package lotto.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LottoGenerator {

    private static final int MAX_LOTTO_NUMBERS_COUNT = 6;

    public static List<Lotto> generateRandomLottos(int purchaseAmount){
        List<Lotto> lottos = new ArrayList<>();
        System.out.println(purchaseAmount);
        for(int i = 0; i < purchaseAmount; ++i){
            lottos.add(generateRandomLottoNumbers());
        }
        return lottos;
    }

    public static Lotto generateRandomLottoNumbers(){
        Set<Integer> numbers = new HashSet<>();
        while(numbers.size() < MAX_LOTTO_NUMBERS_COUNT){
            numbers.add(Randoms.pickNumberInRange(1, 45));
        }
        List<Integer> lottoNumbers = new ArrayList<>(numbers);
        return new Lotto(lottoNumbers);
    }
}
