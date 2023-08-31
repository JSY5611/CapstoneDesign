package com.example.campusin.domain.rank.dto.response;

import com.example.campusin.domain.rank.Rank;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RankListResponse {

    private Long rank;
    private String name;
    private int week;

    @Builder
    public RankListResponse(Long rank, String name, int week) {
        this.rank = rank;
        this.name = name;
        this.week = week;
    }
    @Builder
    public RankListResponse(Rank rank) {
        this(
                rank.getStudyranking(),
                rank.getUser().getNickname(),
                rank.getWeek()
        );
    }
}
