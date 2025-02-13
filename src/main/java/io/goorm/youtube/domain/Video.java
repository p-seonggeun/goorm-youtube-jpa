package io.goorm.youtube.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long videoSeq;

    private String video;
    private String videoThumbnail;

    private String title;
    private String content;

    private int publishYn;
    private String deleteYn;

    private Long member_seq;

    private String regDate;

    public Video() {
        this.publishYn = 0;
        this.deleteYn = "N";
        this.member_seq = 12L;
    }
}
