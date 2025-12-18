"""
Sample module demonstrating crypto library imports.
This is placeholder code for manifest parsing demonstration.
"""

from cryptography.fernet import Fernet
from cryptography.hazmat.primitives import hashes
from OpenSSL import crypto as openssl_crypto
import paramiko
import bcrypt
import jwt
import nacl.secret

import requests
from pydantic import BaseModel


class TokenPayload(BaseModel):
    """Example Pydantic model."""
    sub: str
    exp: int


def demonstrate_imports():
    """Show that crypto libraries are importable."""
    print(f"Fernet available: {Fernet}")
    print(f"Hashes available: {hashes.SHA256}")
    print(f"OpenSSL crypto: {openssl_crypto}")
    print(f"Paramiko: {paramiko.__version__}")
    print(f"bcrypt: {bcrypt}")
    print(f"PyJWT: {jwt}")
    print(f"PyNaCl SecretBox: {nacl.secret.SecretBox}")
    print(f"Requests: {requests.__version__}")
    print(f"Pydantic BaseModel: {BaseModel}")


if __name__ == "__main__":
    demonstrate_imports()
