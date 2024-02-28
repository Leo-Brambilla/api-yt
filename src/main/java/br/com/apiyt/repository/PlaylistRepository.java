package br.com.apiyt.repository;

import br.com.apiyt.model.Playlist;

import java.util.List;

public interface PlaylistRepository {
    Playlist findById(int id);
    List<Playlist> findAll();
    void save(Playlist playlist);
    void update(Playlist playlist);
    void delete(int id);


}
