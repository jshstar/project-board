package com.sparta.project_board.repository;

import com.sparta.project_board.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board , Long> {
    List<Board> findAllByOrderByCreatedAtDesc();
}
