package com.example.campusin.domain.user.dto.response;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by kok8454@gmail.com on 2023-05-20
 * Github : http://github.com/perArdua
 */
@Getter
@Setter
@NoArgsConstructor
public class NickResponse {
    private String nickname;

    public NickResponse(String nickname) {
        this.nickname = nickname;
    }
}
