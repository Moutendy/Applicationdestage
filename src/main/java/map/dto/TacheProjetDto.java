package map.dto;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class TacheProjetDto implements Comparable<TacheProjetDto>{

    private Long id ;
    private String name;
    private String desc;
    private Boolean status;
    private Date start;
    private Date end;
    private ProjetDto projet;
    private EncadrantDto encadrant;

    @Override
    public int compareTo(TacheProjetDto tacheProjetDto) {
        if (!this.name.equals(tacheProjetDto.getName()))
            return this.name.compareTo(tacheProjetDto.getName());
        else
            return this.start.compareTo(tacheProjetDto.getStart());
    }
}
