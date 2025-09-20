package com.exe.localeventmanagement.Impl;

import com.exe.localeventmanagement.Dto.EventDTO;
import com.exe.localeventmanagement.Entity.Event;
import com.exe.localeventmanagement.Entity.Headquarter;
import com.exe.localeventmanagement.Repository.EventRepository;
import com.exe.localeventmanagement.Service.EventService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImpl implements EventService {

    private  final EventRepository eventRepository;
    private final HeadquarterRepository headquarterRepository;

    public EventServiceImpl(EventRepository eventRepository, HeadquarterRepository headquarterRepository) {
        this.eventRepository = eventRepository;
        this.headquarterRepository = headquarterRepository;
    }

    @Override
    public List<EventDTO> listarEventos() {
        return List.of();
    }

    @Override
    public EventDTO obtenerEventoPorId(Long eventId) {
        return null;
    }

    @Override
    public EventDTO crearEvento(EventDTO eventDTO) {
        return null;
    }

    @Override
    public EventDTO actualizarEvento(EventDTO eventDTO) {
        return null;
    }

    @Override
    public void eliminarEvento(Long eventId) {

    }


    //Convertir Entity a DTO
    private  EventDTO convertirADTO(Event event) {
        EventDTO eventDTO = new EventDTO();
        eventDTO.setEventId(eventDTO.getEventId());
        eventDTO.setEventName(eventDTO.getEventName());
        eventDTO.setEventQuota(eventDTO.getEventQuota());
        eventDTO.setEventDate(eventDTO.getEventDate());
        eventDTO.setHeadquarterId(eventDTO.getHeadquarterId());

        return eventDTO;
    }


    //Convertir DTO a Entity
    private Event ConvertirAEntidad(EventDTO eventDTO) {
        Event event = new Event();
        event.setEventId(eventDTO.getEventId());
        event.setEventName(eventDTO.getEventName());
        event.setEventQuota(eventDTO.getEventQuota());
        event.setEventDate(eventDTO.getEventDate());

        if (eventDTO.getHeadquarterId() != null) {
            Headquarter headquarter = headquarterRepository
        }

        return event;
    }
}
