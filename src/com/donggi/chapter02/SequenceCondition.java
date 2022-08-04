package com.donggi.chapter02;

/**
 * 순번 조건 할인(?) 클래스
 * 할인 여부를 판단하기 위해 사용할 순번(Sequence) 인스턴스 변수
 */
public class SequenceCondition implements DiscountCondition {

    private int sequence;

    public SequenceCondition(int sequence) {
        this.sequence = sequence;
    }

    @Override
    public boolean isSatisfiedBy(Screening screening) {
        return screening.isSequence(sequence);
    }

}
