"""
Sample module demonstrating crypto library imports for Poetry project.
This is placeholder code for manifest parsing demonstration.
"""

from cryptography.fernet import Fernet
from cryptography.hazmat.primitives.asymmetric import rsa
from OpenSSL import crypto as openssl_crypto
import paramiko
import bcrypt
import jwt
import nacl.secret
import nacl.utils

import requests
from pydantic import BaseModel, Field


class SecurePayload(BaseModel):
    """Example Pydantic model for secure data."""
    token: str = Field(..., min_length=1)
    algorithm: str = "RS256"
    issued_at: int


def generate_key_pair():
    """Generate an RSA key pair (placeholder)."""
    private_key = rsa.generate_private_key(
        public_exponent=65537,
        key_size=2048,
    )
    return private_key


def demonstrate_crypto_imports():
    """Show that all crypto libraries are properly imported."""
    print("=== Poetry Project Crypto Imports ===")
    print(f"Cryptography Fernet: {Fernet}")
    print(f"OpenSSL crypto module: {openssl_crypto}")
    print(f"Paramiko version: {paramiko.__version__}")
    print(f"bcrypt module: {bcrypt}")
    print(f"PyJWT module: {jwt}")
    print(f"PyNaCl SecretBox: {nacl.secret.SecretBox}")
    print(f"Requests version: {requests.__version__}")


if __name__ == "__main__":
    demonstrate_crypto_imports()
