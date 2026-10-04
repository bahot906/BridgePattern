# Assignment 3: Bridge Design Pattern — Notification System

**Course:** Software Design Patterns  
**Student:** Bakhridenov Alisher  
**Group:** SE-2510

---

## 📌 Project Overview

This project demonstrates the implementation of the **Bridge Structural Design Pattern** in Java.

The chosen domain is a **Flexible Notification System**. The Bridge pattern detaches the high-level message logic (*Abstraction*) from the low-level delivery mechanism (*Implementor*). This design avoids class explosion ($N \times M$ combinations) and enables dynamic runtime switching of delivery channels without modifying the core notification logic.

---

## 🏗️ Architecture & Bridge Components

| Bridge Role | Class / Interface | Description |
| :--- | :--- | :--- |
| **Abstraction** | `Notification` | Abstract base class holding a reference to the `MessageSender` interface. |
| **Refined Abstraction 1** | `AlertNotification` | Prepares urgent, high-priority alert messages. |
| **Refined Abstraction 2** | `PromoNotification` | Prepares marketing and promotional offer messages. |
| **Implementor** | `MessageSender` | Interface declaring the low-level operation (`sendMessage`). |
| **Concrete Implementor 1** | `EmailSender` | Delivers notifications via Email format. |
| **Concrete Implementor 2** | `TelegramSender` | Delivers notifications via Telegram message format. |
| **Client** | `Main` | Demonstrates runtime composition and dynamic switching of delivery channels. |

---

## 🧼 Clean Code Principles Justification

In accordance with the assignment requirements, the following five Clean Code principles were applied and maintained in this codebase:

1. **Clear Separation of Concerns (Abstraction vs. Implementation):**  
   The `Notification` hierarchy is solely responsible for message formatting and business rules, while the `MessageSender` hierarchy handles transport details. Low-level delivery details do not leak into the abstraction.

2. **Single Responsibility Principle (SRP) & Focused Classes:**  
   Each class serves a single, well-defined purpose. For example, `EmailSender` only manages email dispatching, while `AlertNotification` exclusively handles formatting critical system alerts.

3. **Open/Closed Principle (OCP) & Backward Compatibility:**  
   The system is open for extension but closed for modification. Adding a new channel (e.g., `SmsSender` or `WhatsAppSender`) requires creating a new implementation of `MessageSender` without making any changes to `Notification` or its refined subclasses.

4. **Dependency Inversion Principle (DIP):**  
   High-level modules (`Notification`) do not depend on low-level modules (`EmailSender`/`TelegramSender`). Both depend on the `MessageSender` abstraction. Implementations are injected via constructors and setters.

5. **Meaningful Naming:**  
   Class and interface names clearly communicate their architectural roles within the Bridge pattern. `Notification` signifies the abstract business concept, while `MessageSender` unambiguously denotes the implementor role.

---

## 🚀 How to Run

### Prerequisites
* **Java Development Kit (JDK):** Version 11 or higher installed.

### Compilation & Execution via CLI

1. Clone the repository:
   ```bash
   git clone [https://github.com/YOUR_GITHUB_USERNAME/sdp-assignment3-bridge.git](https://github.com/YOUR_GITHUB_USERNAME/sdp-assignment3-bridge.git)
   cd sdp-assignment3-bridge