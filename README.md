# 👤 User Registration Form

A comprehensive user registration system with robust validation rules to ensure data integrity and security during user onboarding.

---

## 📋 Table of Contents

- [Overview](#overview)
- [Features](#features)
- [Validation Rules](#validation-rules)
- [Installation](#installation)
- [Usage](#usage)
- [Contact](#contact)

---

## 🎯 Overview

The **User Registration Form** is a secure validation system designed to ensure all user-provided information meets predefined standards. This system enforces strict validation rules across all user input fields to maintain data quality and security.

---

## ✨ Features

- ✅ **First Name Validation**
- ✅ **Last Name Validation**
- ✅ **Email Validation**
- ✅ **Mobile Number Validation**
- ✅ **Password Strength Validation** (Multiple Rules)
- ✅ **Real-time Error Feedback**
- ✅ **User-friendly Interface**

---

## 📝 Validation Rules

### **UC 1: First Name Entry**
- **Requirement**: Enter a valid First Name
- **Rules**:
  - Minimum 1 character required
  - Mandatory field

### **UC 2: Last Name Entry**
- **Requirement**: Enter a valid Last Name
- **Rules**:
  - Must start with a capital letter (Uppercase)
  - Minimum 3 characters required
  - Mandatory field

### **UC 3: Email Entry**
- **Requirement**: Enter a valid email address
- **Rules**:
  - Three mandatory parts: `id@domain`
  - Minimum 1 character before `@` symbol
  - Minimum 1 character after `@` symbol
  - Must contain exactly one `@` symbol
  - Valid domain structure required

### **UC 4: Mobile Number Format**
- **Requirement**: Follow the pre-defined Mobile Number Format
- **Rules**:
  - First digit must be between 1-9
  - Followed by exactly 8 more digits (0-9)
  - Total of 10 digits required
  - Format: `[1-9]XXXXXXXXX`

### **UC 5: Password Rule 1**
- **Requirement**: Create a strong password
- **Rules**:
  - Minimum 8 characters required
  - All rules must be passed

### **UC 6: Password Rule 2**
- **Requirement**: Password strength requirement
- **Rules**:
  - Must contain at least 1 **Uppercase letter** (A-Z)
  - All rules must be passed

### **UC 7: Password Rule 3**
- **Requirement**: Password complexity requirement
- **Rules**:
  - Must contain at least 1 **Numeric digit** (0-9)
  - All rules must be passed

### **UC 8: Password Rule 4**
- **Requirement**: Password special character requirement
- **Rules**:
  - Must contain exactly 1 **Special Character** (e.g., @, #, $, %, etc.)
  - All rules must be passed

### **UC 9: Email Samples Clearance**
- **Requirement**: Clear all email samples provided separately
- **Rules**:
  - All sample emails must be validated against the email validation rules
  - Test cases for email validation must pass

---

## 📊 Example Valid Entries

| Field | Valid Example | Notes |
|-------|---|---|
| First Name | `John` | Minimum 1 character |
| Last Name | `Doe` | Starts with capital, 3+ chars |
| Email | `john.doe@example.com` | Standard email format |
| Mobile | `9876543210` | 10 digits, first digit 1-9 |
| Password | `SecurePass@123` | 8+ chars, 1 uppercase, 1 number, 1 special char |

---

## 🚀 Installation

```bash
# Clone the repository
git clone [repository-url]

# Navigate to the project directory
cd User_Registration_Form

# Install dependencies (if applicable)
npm install
```

---

## 💻 Usage

1. Open the registration form
2. Fill in all required fields
3. Ensure all validation rules are met
4. Submit the form upon successful validation
5. Receive confirmation message

---

## 📞 Contact

For support or inquiries, please contact the development team at **Bridgelabz**.

---

## 📄 License

This project is part of the Bridgelabz RFP (Request for Proposal) initiative.

---

**Last Updated**: May 2026
