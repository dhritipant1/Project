package com.dhriti.task.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name="ledger")
@Entity
public class Ledger {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
int id;
int studentId;
float expenseUsed;
String comment;
float remaining;
LocalDateTime date;

}
