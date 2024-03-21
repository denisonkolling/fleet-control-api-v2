package com.fleetcontrol.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tab_images")
public class Image {

  @Id
  @GeneratedValue
  Long id;

  @Lob
  byte[] content;

  String name;

}
