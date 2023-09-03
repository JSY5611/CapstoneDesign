package com.example.campusin.domain.rank.dto.response;
import com.example.campusin.domain.rank.Rank;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RankListQuestResponse {

    private Long rank;
    private String name;
    private int week;
    private int month;

    @Builder
    public RankListQuestResponse(Long rank, String name, int week, int month) {
        this.rank = rank;
        this.name = name;
        this.week = week;
        this.month = month;
    }
    @Builder
    public RankListQuestResponse(Rank rank) {
        this(
                rank.getQuestionRanking(),
                rank.getUser().getNickname(),
                rank.getStartDate(rank.getStatistics().getDate()).getDayOfMonth() / 7 + 1,
                rank.getStartDate(rank.getStatistics().getDate()).getMonthValue()
        );
    }
}