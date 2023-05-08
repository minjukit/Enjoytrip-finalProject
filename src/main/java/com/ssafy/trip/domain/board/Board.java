package com.ssafy.trip.domain.board;

import com.ssafy.trip.domain.User;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@ToString
@EntityListeners(AuditingEntityListener.class)
public class Board {

    @Id
    @GeneratedValue
    @Column(name = "board_id")
    private Long id;

    private String title;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(length = 1000)
    private String content;

    private Long count; // 조회수

    @CreatedDate
    @Column(name = "created_date", updatable = false)
    private LocalDate createdDate;

    @LastModifiedDate
    @Column(name = "modified_date")
    private LocalDate modifiedDate;
}