package MiddleTest.test4;

import java.util.*;

public class WordCounter {
    public static void main(String[] args) {
        WordInfo info=check("인공지능 기술은 현재 우리의 삶을 변화시키고 있으며 미래에는 더욱 더 중요한 역할을 할 것으로 예상됩니다 이 기술은 컴퓨터 시스템이 인간의 지능을 모방하고 특정 작업을 수행할 수 있도록 하는 것을 포함합니다 인공지능 다양한 형태로 발전하고 있으며 머신러닝과 딥러닝 같은 알고리즘의 발전은 이 기술의 발전을 가속화시키고 있습니다 머신러닝과 딥러닝은 대량의 데이터를 분석하고 패턴을 식별하여 문제를 해결합니다 이런 기술은 의료 분야에서는 질병 진단 및 예측 의료 영상 해석 개인 맞춤형 치료 등에 사용되고 있습니다 또한 금융 분야에서는 사기 탐지 신용 점수 산정 주식 시장 예측 등 다양한 분야에 적용되어 고도화되고 있습니다 자연어 처리(NLP) 기술의 발전으로는 컴퓨터가 인간의 언어를 이해하고 생성할 수 있게 되었습니다 이러한 기술은 검색 엔진 최적화(SEO) 챗봇 개발 번역 서비스 등 다양한 분야에서 사용되고 있습니다 특히 의료 분야에서는 환자와 의사 간의 의사소통을 원활하게 하고 의료 기록을 관리하는 데 사용되고 있습니다 인공지능 기술은 또한 산업 자동화를 가속화하고 있습니다 로봇 공학 분야에서는 AI가 로봇의 동작을 최적화하고 생산성을 향상시키는 데 사용되고 있습니다 또한 제조업에서는 자동화된 시스템이 생산 과정을 최적화하고 인력을 절감하는 데 활용되고 있습니다 그러나 이러한 기술 발전은 도전과 과제도 함께 가져왔습니다 데이터 프라이버시 윤리적 문제 일자리의 자동화 등이 그 예입니다 또한 인공지능 의 결정 과정이 투명하지 않을 경우에는 신뢰성 문제가 발생할 수 있습니다 이러한 문제들은 정부 기업 및 학계에서 공동으로 해결해야 할 과제입니다 또한 인간과 기계 간의 관계에 대한 사회적인 측면도 고려되어야 합니다 기술의 발전으로 인한 사회적인 영향을 예측하고 조절하는 것이 중요합니다 이를 통해 인간의 복지와 발전을 도모할 수 있습니다 결론적으로 인공지능 기술은 우리의 삶을 긍정적으로 변화시키고 있으며 미래에는 더욱 더 중요한 역할을 할 것으로 기대됩니다 하지만 이러한 기술의 발전은 책임 있는 방향으로 이뤄져야 하며 인간의 복지와 발전을 위해 사용되어야 합니다 함께 노력하여 인공지능 기술이 보다 포용적이고 지속 가능한 미래를 만들어 나갈 수 있기를 희망합니다");

        System.out.println("1. 문자열에서 가장 긴 단어 :"+info.getLongestWord());

        System.out.println("2. 문자열에서 가장 많이 나온 단어 Top 3 : ");
        List<Map.Entry<String, Integer>> mostFrequentWords = info.getMostFrequentWords(3);
        for(Map.Entry<String,Integer> entry: mostFrequentWords){
            System.out.println("단어:"+entry.getKey()+", 빈도수:"+entry.getValue());
        }
    }
    public static WordInfo check(String text){
        if (text == null || text.isEmpty()) {
            throw new IllegalArgumentException("텍스트가 비어 있습니다.");
        }

        WordInfo info=new WordInfo();

        // 문자열 Split 로직 샘플
        //공백이 1칸 이상을 인식하여 2개의 데이터로 잘라준다.
        String[]words=text.split("\\s+");
        for(String word:words){
            info.addWord(word);
        }
        return info;
    }

}
