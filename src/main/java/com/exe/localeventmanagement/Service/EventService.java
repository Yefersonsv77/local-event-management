package com.exe.localeventmanagement.Service;

import com.exe.localeventmanagement.Dto.EventDTO;

import java.util.List;

public interface EventService {

    List<EventDTO> listarEventos();

    EventDTO obtenerEventoPorId(Long eventId);

    EventDTO crearEvento(EventDTO eventDTO);

    EventDTO actualizarEvento(EventDTO eventDTO);

    void eliminarEvento(Long eventId);

}
