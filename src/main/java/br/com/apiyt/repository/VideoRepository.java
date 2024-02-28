package br.com.apiyt.repository;

import br.com.apiyt.model.Video;

import java.util.List;

public interface VideoRepository {
    Video findById(int id);
    List<Video> findByPlaylist(int idPlaylist);
    List<Video> findByCategory(String category);
    void save(Video video);
    void update(Video video);
    void delete(int id);

}
