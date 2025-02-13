package io.goorm.youtube.repository;

import io.goorm.youtube.domain.Video;
import io.goorm.youtube.dto.VideoCreateDTO;
import io.goorm.youtube.dto.VideoMainDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface VideoRepository extends JpaRepository<Video, Long> {

    @Query("SELECT v FROM Video v WHERE v.deleteYn = 'N' AND v.publishYn = 1 ORDER BY v.regDate DESC")
    List<VideoMainDTO> findIndex();

    Page<VideoMainDTO> findAllByDeleteYn(String deleteYn, Pageable pageable);

    Optional<VideoCreateDTO> findByVideoSeq(Long id);
}
