/**
 * Sample Node.js application demonstrating crypto library imports.
 * This is placeholder code for manifest parsing demonstration.
 */

const jose = require('jose');
const jwt = require('jsonwebtoken');
const forge = require('node-forge');
const bcrypt = require('bcrypt');
const express = require('express');
const _ = require('lodash');

async function demonstrateCryptoImports() {
    console.log('=== Node.js Crypto Imports Demo ===\n');

    // jose library
    console.log('jose module loaded:', typeof jose.SignJWT === 'function');

    // jsonwebtoken library
    console.log('jsonwebtoken loaded:', typeof jwt.sign === 'function');

    // node-forge library
    console.log('node-forge loaded:', typeof forge.pki === 'object');

    // bcrypt library
    console.log('bcrypt loaded:', typeof bcrypt.hash === 'function');

    // Non-crypto libraries
    console.log('express loaded:', typeof express === 'function');
    console.log('lodash version:', _.VERSION);

    // Example: Generate a bcrypt hash placeholder
    const saltRounds = 10;
    const samplePassword = 'sample-password';
    const hash = await bcrypt.hash(samplePassword, saltRounds);
    console.log('\nSample bcrypt hash generated:', hash.substring(0, 20) + '...');
}

// Express app placeholder
const app = express();
app.get('/', (req, res) => {
    res.json({ status: 'ok', message: 'Crypto demo app running' });
});

demonstrateCryptoImports()
    .then(() => console.log('\nAll crypto libraries loaded successfully!'))
    .catch(err => console.error('Error:', err));
